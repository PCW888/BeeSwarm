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
public class Flower 
{

    private int X=250;
    private int Y=250;
    private int Width=100;
    private int Height=173;
    
    private Image MotherDay;
    
    public Flower() throws IOException
    {
        MotherDay = ImageIO.read(getClass().getResource("mother-day01.png"));
    }
   
    public void paint(Graphics g)
    {
        g.drawImage(MotherDay, 1050-X, 650-Y, Width, Height, null);
    }
    
}
