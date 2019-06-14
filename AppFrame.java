/*

Copyright: All contributers to the Umple Project

This file is made available subject to the open source license found at:
http://umple.org/license

*/

//@author Firas Jribi {@link firas.jribi.tn@gmail.com}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppFrame extends JFrame implements View{
	private int nButtons;

	public AppFrame (Controller controller){
		setLayout (new GridLayout(6,1));
		
		JButton buildUmpleFirst = new JButton("Build Umple First");
		buildUmpleFirst.addActionListener(controller);
		add(buildUmpleFirst);
		nButtons++;

			
		JButton buildUmple = new JButton("Build Umple");
		buildUmple.addActionListener(controller);
		add(buildUmple);
		nButtons++;

		
		JButton buildUmpleOnline = new JButton("Build Umple Online");
		buildUmpleOnline.addActionListener(controller);
		add(buildUmpleOnline);
		nButtons++;

		
		JButton buildUmpleQuick = new JButton("Build Umple Quick");
		buildUmpleQuick.addActionListener(controller);
		add(buildUmpleQuick);
		nButtons++;


		JButton buildDoc = new JButton("Build Doc");
		buildDoc.addActionListener(controller);
		add(buildDoc);
		nButtons++;

		
		JButton runApache = new JButton("Run Apache");
		runApache.addActionListener(controller);
		add(runApache);
		nButtons++;


		//setup

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,120*nButtons);

		//display the window
		setVisible(true);		
	}




}