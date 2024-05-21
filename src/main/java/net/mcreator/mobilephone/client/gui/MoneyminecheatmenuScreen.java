package net.mcreator.mobilephone.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mobilephone.world.inventory.MoneyminecheatmenuMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MoneyminecheatmenuScreen extends AbstractContainerScreen<MoneyminecheatmenuMenu> {
	private final static HashMap<String, Object> guistate = MoneyminecheatmenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty1;

	public MoneyminecheatmenuScreen(MoneyminecheatmenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mobilephone:textures/screens/moneyminecheatmenu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.mobilephone.moneyminecheatmenu.label_setmoney"), 117, 42, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty1 = Button.builder(Component.translatable("gui.mobilephone.moneyminecheatmenu.button_empty1"), e -> {
		}).bounds(this.leftPos + 122, this.topPos + 18, 25, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
