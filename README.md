# SCB_QA-Automation_Quiz
- Download Git Extension se for push/pull code between your local station and remote repository.
- Click on Clone repository and download to your own destination
- Download Aroid Studio and slelect *File* | *Open...* and point to the `./build.gradle` file. (You'll see green icon)
- Check out the relevant code:
    * The application under test is located in `src/androidTest/java`
    * Tests are in `src/androidTest/java`
- Create the test configuration with a custom runner: `androidx.test.runner.AndroidJUnitRunner`
    * Open *Run* menu | *Edit Configurations*
    * Add a new *Android Tests* configuration
    * Choose a module
    * Add a *Specific instrumentation runner*: `androidx.test.runner.AndroidJUnitRunner`
- Connect a device or start an emulator
- Click run
