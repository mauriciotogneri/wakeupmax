package com.mauriciotogneri.wakeupmax.objects;

import com.mauriciotogneri.wakeupmax.controls.Input;
import com.mauriciotogneri.wakeupmax.utils.Resources;

public class Level
{
	private final Protagonist max;
	private final Background background;
	
	public static final int BLOCK_SIZE = 32;
	
	public Level()
	{
		Building building = new Building(Resources.Levels.LEVEL_1);
		
		this.background = new Background(1, Resources.Images.Levels.LEVEL_1);
		this.background.start();
		
		this.max = new Protagonist(building);
		this.max.start();
	}
	
	public void update(float delta, Input input)
	{
		this.max.update(delta, input);
	}
}