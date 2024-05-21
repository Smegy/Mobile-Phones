package net.mcreator.mobilephone.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mobilephone.world.inventory.DefaultDesktopMenu;
import net.mcreator.mobilephone.network.DefaultDesktopButtonMessage;
import net.mcreator.mobilephone.MobilephoneMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DefaultDesktopScreen extends AbstractContainerScreen<DefaultDesktopMenu> {
	private final static HashMap<String, Object> guistate = DefaultDesktopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;

	public DefaultDesktopScreen(DefaultDesktopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 132;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("mobilephone:textures/screens/default_desktop.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.mobilephone.default_desktop.label_gitter"), 20, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mobilephone.default_desktop.label_moneymine"), 65, 47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.mobilephone.default_desktop.label_dev_tools"), 11, 92, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_empty = Button.builder(Component.translatable("gui.mobilephone.default_desktop.button_empty"), e -> {
			if (true) {
				MobilephoneMod.PACKET_HANDLER.sendToServer(new DefaultDesktopButtonMessage(0, x, y, z));
				DefaultDesktopButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 20, this.topPos + 20, 25, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.mobilephone.default_desktop.button_empty1"), e -> {
		}).bounds(this.leftPos + 74, this.topPos + 20, 25, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = Button.builder(Component.translatable("gui.mobilephone.default_desktop.button_empty2"), e -> {
			if (true) {
				MobilephoneMod.PACKET_HANDLER.sendToServer(new DefaultDesktopButtonMessage(2, x, y, z));
				DefaultDesktopButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 20, this.topPos + 65, 25, 20).build();
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
	}
}
