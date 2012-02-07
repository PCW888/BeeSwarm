/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author workshopjan23
 */
public class MiniBees 
{
    
    private int X = 500;
    private int Y = 500;
    private int Width = 100*3/5;
    private int Height = 75*3/5;
    
    private Image Bee;
    
    public MiniBees() throws IOException
    {
        Bee = ImageIO.read(getClass().getResource("bee_right.png"));
    }
   
    public void paint(Graphics g)
    {
        g.drawImage(Bee, X, Y, Width, Height, null);
    }
}
