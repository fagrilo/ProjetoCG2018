package facens.cg.projetomaven;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GL2GL3;


public class Animal{
    
    protected double rotateX = 0, rotateY = 0, angleX = 0, angleY = 0;
    public static int i = -15, j = 15; 
    public static boolean andar = true;
    
    public void draw(GL2 gl)
    {        
         gl.glPushMatrix();            
            rotate(gl);
            drawBody(gl);
            drawHead(gl);
            drawLegs(gl);
        gl.glPopMatrix();
    }
    
    //Draw Body  
    public void drawBody(GL2 gl) {
        
        double aux2 = 0.5;
        double aux = 1;        
        Color color = new Color(1, 0.5, 0);
        
        drawLeft(gl, aux2, aux2, aux, color);
        drawRight(gl, aux2, aux2, aux, color);
        drawTop(gl, aux2, aux, aux2, color);
        drawBottom(gl, aux2, aux, aux2, color);
        drawFront(gl, aux2, aux, aux2, color);
        drawBack(gl, aux2, aux, aux2, color);
        
    }
        
    //drawHead
    public void drawHead(GL2 gl) {
        double auxHead = 0.3;
        double auxEar = 0.09;
        double largNose = 0.07;
        double altNose = 0.07;
        Color color = new Color(1, 0.5, 0);
        Color color2 = new Color(0, 0, 0);        

        gl.glPushMatrix();
            gl.glTranslated(1.3, 0.25, 0);
                drawLeft(gl, auxHead, auxHead, auxHead, color);
                drawRight(gl, auxHead, auxHead, auxHead, color);
                drawTop(gl, auxHead, auxHead, auxHead, color);
                drawBottom(gl, auxHead, auxHead, auxHead, color);
                drawFront(gl, auxHead, auxHead, auxHead, color);
                drawBack(gl, auxHead, auxHead, auxHead, color);            
                gl.glTranslated(-0.2,0.3,0.15);
                    drawLeft(gl, auxEar, auxEar, auxEar, color2);
                    drawRight(gl, auxEar, auxEar, auxEar, color2);
                    drawTop(gl, auxEar, auxEar, auxEar, color2);
                    drawBottom(gl, auxEar, auxEar, auxEar, color2);
                    drawFront(gl, auxEar, auxEar, auxEar, color2);
                    drawBack(gl, auxEar, auxEar, auxEar, color2);
                    gl.glTranslated(0,0,-0.3);
                        drawLeft(gl, auxEar, auxEar, auxEar, color2);
                        drawRight(gl, auxEar, auxEar, auxEar, color2);
                        drawTop(gl, auxEar, auxEar, auxEar, color2);
                        drawBottom(gl, auxEar, auxEar, auxEar, color2);
                        drawFront(gl, auxEar, auxEar, auxEar, color2);
                        drawBack(gl, auxEar, auxEar, auxEar, color2);
        gl.glPopMatrix();
        gl.glPushMatrix();
            gl.glTranslated(1.6, 0.2, 0);
                drawLeft(gl, altNose, largNose, largNose, color2);
                drawRight(gl, altNose, largNose, largNose, color2);
                drawTop(gl, altNose, largNose, altNose, color2);
                drawBottom(gl, altNose, largNose, altNose, color2);
                drawFront(gl, altNose, largNose, altNose, color2);
                drawBack(gl, altNose, largNose, altNose, color2);
                gl.glTranslated(-0.065,0.15,0.2);
                    gl.glRotated(90,0,1,0);
                    drawFront(gl, altNose, largNose, altNose, color2);
                    gl.glTranslated(0.4,0,0);
                        drawFront(gl, altNose, largNose, altNose, color2);                        
        gl.glPopMatrix();
    }
    //drawLegs
    public void drawLegs(GL2 gl) {
        
        double aux = 0.35;
        double aux2 = 0.15;
        double graus = 90+i;
        double graus2 = 90+j;
        
        Color color = new Color(1, 0.5, 0);
        
        gl.glPushMatrix();
            gl.glTranslated(0.75,0.13,0.6);
            gl.glRotated(graus2,0,0,1);
                drawLeft(gl, aux2, aux2, aux, color);
                drawRight(gl, aux2, aux2, aux, color);
                drawTop(gl, aux2, aux, aux2, color);
                drawBottom(gl, aux2, aux, aux2, color);
                drawFront(gl, aux2, aux, aux2, color);
                drawBack(gl, aux2, aux, aux2, color);
                gl.glTranslated(-0.5,0,0);
                    drawLeft(gl, aux2, aux2, aux, color);
                    drawRight(gl, aux2, aux2, aux, color);
                    drawTop(gl, aux2, aux, aux2, color);
                    drawBottom(gl, aux2, aux, aux2, color);
                    drawFront(gl, aux2, aux, aux2, color);
                    drawBack(gl, aux2, aux, aux2, color);
        gl.glPopMatrix();
        gl.glPushMatrix();
            gl.glTranslated(-0.75,0.13,0.6);
            gl.glRotated(graus,0,0,1);
                drawLeft(gl, aux2, aux2, aux, color);
                drawRight(gl, aux2, aux2, aux, color);
                drawTop(gl, aux2, aux, aux2, color);
                drawBottom(gl, aux2, aux, aux2, color);
                drawFront(gl, aux2, aux, aux2, color);
                drawBack(gl, aux2, aux, aux2, color); 
                gl.glTranslated(-0.5,0,0);
                    drawLeft(gl, aux2, aux2, aux, color);
                    drawRight(gl, aux2, aux2, aux, color);
                    drawTop(gl, aux2, aux, aux2, color);
                    drawBottom(gl, aux2, aux, aux2, color);
                    drawFront(gl, aux2, aux, aux2, color);
                    drawBack(gl, aux2, aux, aux2, color);
        gl.glPopMatrix();
        gl.glPushMatrix();
            gl.glTranslated(-0.75,0.13,-0.6);
            gl.glRotated(graus2,0,0,1);
                drawLeft(gl, aux2, aux2, aux, color);
                drawRight(gl, aux2, aux2, aux, color);
                drawTop(gl, aux2, aux, aux2, color);
                drawBottom(gl, aux2, aux, aux2, color);
                drawFront(gl, aux2, aux, aux2, color);
                drawBack(gl, aux2, aux, aux2, color); 
                gl.glTranslated(-0.5,0,0);
                    drawLeft(gl, aux2, aux2, aux, color);
                    drawRight(gl, aux2, aux2, aux, color);
                    drawTop(gl, aux2, aux, aux2, color);
                    drawBottom(gl, aux2, aux, aux2, color);
                    drawFront(gl, aux2, aux, aux2, color);
                    drawBack(gl, aux2, aux, aux2, color);
        gl.glPopMatrix();
        gl.glPushMatrix();
            gl.glTranslated(0.75,0.13,-0.6);
            gl.glRotated(graus,0,0,1);
                drawLeft(gl, aux2, aux2, aux, color);
                drawRight(gl, aux2, aux2, aux, color);
                drawTop(gl, aux2, aux, aux2, color);
                drawBottom(gl, aux2, aux, aux2, color);
                drawFront(gl, aux2, aux, aux2, color);
                drawBack(gl, aux2, aux, aux2, color);
                gl.glTranslated(-0.5,0,0);
                    drawLeft(gl, aux2, aux2, aux, color);
                    drawRight(gl, aux2, aux2, aux, color);
                    drawTop(gl, aux2, aux, aux2, color);
                    drawBottom(gl, aux2, aux, aux2, color);
                    drawFront(gl, aux2, aux, aux2, color);
                    drawBack(gl, aux2, aux, aux2, color);
        gl.glPopMatrix();
    }
    
    public void walk() {
        if(andar) {
            i++;
            j--;
        }
        else{
            j++;
            i--;
        }
        if(i==15)
            andar = false;
        if(j==15)
            andar = true;
    }
    
    private void drawFront(GL2 gl, double alt, double larg, double translated, Color color) {
        gl.glPushMatrix();
            gl.glTranslated(0,0,translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
    
    private void drawBack(GL2 gl, double alt, double larg, double translated, Color color) {
        gl.glPushMatrix();
            gl.glTranslated(0, 0, -translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
        
    private void drawLeft(GL2 gl, double alt, double larg, double translated, Color color) {
        gl.glPushMatrix();
            gl.glRotated(90, 0, 1, 0);
            gl.glTranslated(0, 0, -translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
    
    private void drawRight(GL2 gl, double alt, double larg, double translated, Color color) {
        gl.glPushMatrix();
            gl.glRotated(90, 0, 1, 0);
            gl.glTranslated(0, 0, translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
    
    private void drawTop(GL2 gl, double alt, double larg, double translated, Color color) {        
        gl.glPushMatrix();
            gl.glRotated(90, 1, 0, 0);
            gl.glTranslated(0, 0, -translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
    
    private void drawBottom(GL2 gl, double alt, double larg, double translated, Color color) {
        gl.glPushMatrix();
            gl.glRotated(90, 1, 0, 0);
            gl.glTranslated(0, 0, translated);
            drawSquare(gl, alt, larg, color);
        gl.glPopMatrix();
    }
    
    private void drawSquare(GL2 gl, double alt, double larg, Color color) {

        gl.glColor3d(color.getR(), color.getG(), color.getB());
        gl.glBegin(GL2GL3.GL_QUADS);
            gl.glVertex3d(-larg, -alt,  0);
            gl.glVertex3d( larg, -alt,  0);
            gl.glVertex3d( larg,  alt,  0);
            gl.glVertex3d(-larg,  alt,  0);
        gl.glEnd();
    }   
    
    
    
    
    
    //Rotate
    private void rotate(GL2 gl)
    {
        if(rotateX == 1)
            angleX += getRotationSpeedX();
        else if(rotateX == -1)
            angleX -= getRotationSpeedX();

        if(angleX >= 360)
            angleX -= 360;
        else if(angleX < 0)
            angleX += 360;

        gl.glRotated(angleX, 1, 0, 0);

        if(rotateY == 1)
            angleY += getRotationSpeedY();
        else if(rotateY == -1)
            angleY -= getRotationSpeedY();

        if(angleY >= 360)
            angleY -= 360;
        else if(angleY < 0)
            angleY += 360;

        gl.glRotated(angleY, 0, 1, 0);
    }
    
    public void activateVerticalRotation(boolean isPositive)
    {
        rotateX = isPositive ? 1 : -1;
    }

    public void activateHorizontalRotation(boolean isPositive)
    {
        rotateY = isPositive ? 1 : -1;
    }

    public void deactivateVerticalRotation()
    {
        rotateX = 0;
    }

    public void deactivateHorizontalRotation()
    {
        rotateY = 0;
    }

    protected double getRotationSpeedX()
    {
        return 0.5;
    }

    protected double getRotationSpeedY()
    {
        return 0.5;
    }
}
