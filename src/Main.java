//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LunarRoverController controller = new LunarRoverController();

        // Simulating button presses
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // Interact with color camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Take picture with color camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state

        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // Interact with color camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // moon selfie
        controller.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state

        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 10); // Interact with 16-mm camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Take picture with 16-mm camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state

        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 10); // Interact with 16-mm camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 5); // moon selfie with 16-mm camera
        controller.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state

        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Interact with drill
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Interact with drill
        controller.buttonPressed(LunarRoverController.Button.BUTTON_1, 1); // Toggle drill
        controller.buttonPressed(LunarRoverController.Button.BUTTON_2, 0); // Return to idle state
    }
}