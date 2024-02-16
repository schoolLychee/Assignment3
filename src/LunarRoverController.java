public class LunarRoverController {
    // States enumeration
    enum State {
        IDLE {
            @Override
            void entryAction() {
                System.out.println("Entered IDLE state.");
            }
        },
        COLOR_CAMERA {
            @Override
            void entryAction() {
                System.out.println("Entered COLOR_CAMERA state.");
            }
        },
        CAMERA_16MM {
            @Override
            void entryAction() {
                System.out.println("Entered CAMERA_16MM state.");
            }
        },
        DRILL {
            @Override
            void entryAction() {
                System.out.println("Entered DRILL state.");
            }
        };

        // Entry action method for each state
        abstract void entryAction();
    }

    // Button enumeration
    enum Button {
        BUTTON_1, BUTTON_2
    }

    // Current state variable
    private State currentState;
    private int button1PressCount;

    // Constructor
    public LunarRoverController() {
        currentState = State.IDLE;
        currentState.entryAction(); // Initial entry action
        button1PressCount = 0;
    }

    // Method to handle button press
    public void buttonPressed(Button button, int durationInSeconds) {
        switch (button) {
            case BUTTON_1:
                handleButton1(durationInSeconds);
                break;
            case BUTTON_2:
                handleButton2();
                break;
        }
    }

    // Method to handle Button 1 press
    private void handleButton1(int durationInSeconds) {
        button1PressCount++;

        switch (currentState) {
            case IDLE:
                if (durationInSeconds == 5)
                    currentState = State.COLOR_CAMERA;
                else if (durationInSeconds == 10)
                    currentState = State.CAMERA_16MM;
                else if (button1PressCount == 2)
                    currentState = State.DRILL;
                break;
            case COLOR_CAMERA, CAMERA_16MM:
                if (durationInSeconds == 1)
                    takePicture();
                else if (durationInSeconds == 5)
                    temporizer();
                break;
            case DRILL:
                // Button 1 acts as an on/off switch for the drill
                toggleDrill();
                break;
        }
        currentState.entryAction(); // Entry action after state transition
    }

    // Method to handle Button 2 press
    private void handleButton2() {
        currentState = State.IDLE;
        currentState.entryAction(); // Entry action after state transition
    }

    // Method to take a picture
    private void takePicture() {
        System.out.println("Picture taken.");
    }

    // Method to activate the timer (for moon selfies)
    private void temporizer() {
        System.out.println("moon selfie.");
    }

    // Method to toggle the drill on/off
    private void toggleDrill() {
        System.out.println("Drill toggled off");
    }
}