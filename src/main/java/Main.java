package main.java;

import org.lwjgl.Version;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

import java.nio.IntBuffer;

public class Main {
    // TODO: Maybe move some of this code into the Window class
    private static long window;
    private static int width = 256;
    private static int height = 256;

    private static void init() {
        // deals with errors
        GLFWErrorCallback.createPrint(System.err).set();

        // Initialize GLFW
        if (!glfwInit())
            throw new IllegalStateException("Error: can't initialize GLFW");

        // Configure GLFW
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        // create the window
        window = glfwCreateWindow(width, height, "Raytracer", NULL, NULL);
        if (window == NULL)
            throw new RuntimeException("Error: can't create the window");

        // close window if escape key is pressed
        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE)
                glfwSetWindowShouldClose(window, true);
        });
        // Get the thread stack and push a new frame
        try (MemoryStack stack = stackPush()) {
            IntBuffer pWidth = stack.mallocInt(1);
            IntBuffer pHeight = stack.mallocInt(1);

            // Get the window size passed to glfwCreateWindow
            glfwGetWindowSize(window, pWidth, pHeight);

            // Get the resolution of the primary monitor
            GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

            // Center the window
            glfwSetWindowPos(window, (vidmode.width() - pWidth.get(0)) / 2, (vidmode.height() - pHeight.get(0)) / 2);
        }

        glfwMakeContextCurrent(window);
        glfwSwapInterval(1);
        glfwShowWindow(window);
    }

    private static void loop() {
        GL.createCapabilities();
        // black screen by default
        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        while (!glfwWindowShouldClose(window)) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glfwSwapBuffers(window);
            glfwPollEvents(); // check for events, e.g. ESC key pressed
        }
    }

    public static void main(String[] args) {
        // TODO: create Scene and objects
        // TODO: raytrace
        init();
        loop();
        /*
         * final code will look something like this:
         * 1. create Scene
         * 2. place a Camera at the origin (0,0,0)
         * 3. put objects into the Scene
         * 4. Run ray tracing algorithm
         * 5. Render graphics into the Window
         */
        // free callbacks & destroy the window
        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        // terminate GLFW
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
}