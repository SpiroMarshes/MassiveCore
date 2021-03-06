package com.massivecraft.massivecore.command.type;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.massivecraft.massivecore.command.type.primitive.TypeObject;
import com.massivecraft.massivecore.item.DataItemStack;

public class TypeDataItemStack extends TypeTransformer<ItemStack, DataItemStack>
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //
	
	private static final TypeDataItemStack i = new TypeDataItemStack();
	public static TypeDataItemStack get() { return i; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public TypeDataItemStack(Type<ItemStack> typeInner)
	{
		super(typeInner, TypeObject.get(DataItemStack.class));
	}
	
	public TypeDataItemStack()
	{
		this(TypeItemStack.get());
	}

	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public DataItemStack innerToOuter(ItemStack inner, CommandSender sender)
	{
		return DataItemStack.fromBukkit(inner);
	}

	@Override
	public ItemStack outerToInner(DataItemStack outer)
	{
		return DataItemStack.toBukkit(outer);
	}	

}
