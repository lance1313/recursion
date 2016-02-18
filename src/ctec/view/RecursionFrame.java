package ctec.view;

import javax.swing.*;

import ctec.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Lets recurse");
		this.setSize(500,500);
		this.setVisible(true);
		
	}
}
