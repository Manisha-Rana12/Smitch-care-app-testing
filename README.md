# Smitch-care-app-testing
### SmitchCareAutomation is an Appium-based automation framework designed to test key functionalities of the SmitchCare hybrid application. The automation suite covers testing essential features like basic permissions, login, and mood tracking

## Features

- Basic Permissions Handling: Automates the process of granting necessary app permissions (notifications, location, Bluetooth, etc.).
- User Login: Verifies login functionality using email authentication.
- Mood Tracking: Automates the mood logging process, including selecting moods, adding notes, and navigating through the interface.

## Prerequisites

- Java JDK 8 or higher

- Appium Server

- Android SDK

- Maven

- Selenium WebDriver

- TestNG

- A physical or virtual Android device

  ## Test cases

Test case 1: Basic Permissions Handling

- Description: Verifies that the app requests and receives necessary permissions.

- Allow notifications, location, nearby sharing, and Bluetooth access.

- Navigate to the next screen.
Status: ✅ Pass

Test case 2:  Login Functionality

- Description: Validates the user login process.

- Click on "Login" and select "Already have an account."

- Choose "Login with Email," enter credentials, and submit.
Status: ✅ Pass

Test case 3: Mood Tracking

- Description: Automates mood logging and associated activities.

- Scroll to the "Mood" section and select a mood.

- Choose emotional states, add notes, and save.

- Log the mood entry successfully.
Status: ✅ Pass

## Notes

- Some UI elements required coordinate-based scrolling due to Appium’s limitations with UiSelector.

- Enhancements can be made to include additional functionalities like hydration and sleep tracking.


