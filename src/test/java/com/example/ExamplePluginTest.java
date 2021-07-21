package com.example;

import com.lootbeams.LootBeamsPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LootBeamsPlugin.class);
		RuneLite.main(args);
	}
}