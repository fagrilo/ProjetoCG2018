package facens.cg.projetomaven;


import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.Animator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class JogoMain
        implements GLEventListener, KeyListener {

    GLU glu = new GLU();
    
    Animal animal = new Animal();
    
    public static void main(String args[])
    {
        new JogoMain();
    }
    private double r;

    public JogoMain()
    {
        GLJPanel canvas = new GLJPanel();
        canvas.addGLEventListener(this);
        canvas.addKeyListener(this);
        
        JFrame frame = new JFrame("151002");
        frame.setSize(500, 500);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
      
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        System.exit(0);
                    }
                }).start();
            }
        });

    
    }

    public void init(GLAutoDrawable glAuto) {
        Animator a = new Animator(glAuto);
        a.start();
    }

    @Override
    public void display(GLAutoDrawable glAuto) {

        GL2 gl = glAuto.getGL().getGL2();

        gl.glLoadIdentity();
        gl.glTranslated(0,0,-4);

        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glClear(GL.GL_COLOR_BUFFER_BIT |
                GL.GL_DEPTH_BUFFER_BIT
        );

        
        animal.draw(gl);
    }
    
    @Override
    public void reshape(GLAutoDrawable gLAutoDrawable, int x, int y, int w, int h) {
  
        GL2 gl = gLAutoDrawable.getGL().getGL2(); 
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(60,1,1,30);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
        gl.glTranslated(0,0,-5);
    }

    public void displayChanged(GLAutoDrawable arg0, boolean arg1, boolean arg2) {
      
    }

    @Override
    public void dispose(GLAutoDrawable glad) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar())
        {
            case 'w':
                animal.activateVerticalRotation(true); break;
            case 's':
                animal.activateVerticalRotation(false); break;
            case 'a':
                animal.activateHorizontalRotation(true); break;
            case 'd':
                animal.activateHorizontalRotation(false); break;
            case 'r':
                animal.walk(); break;
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyChar())
        {
            case 'w':
                animal.deactivateVerticalRotation(); break;
            case 's':
                animal.deactivateVerticalRotation(); break;
            case 'a':
                animal.deactivateHorizontalRotation(); break;
            case 'd':
                animal.deactivateHorizontalRotation(); break;
        }
    }
}
