# Minecraft MOD in Scala

In this guide we are going to work with Minecraft Forge API for developing Minecraft Mods. The official guide to start 
working with this API is [here](http://mcforge.readthedocs.io/en/latest/gettingstarted/) which is based on Java, 
but as this demo also has the Scala usage component, we will need to consider a set of additional steps to achieve this.

### Before Start
Make sure you have JDK 8 installed on your machine and fork or clone this repository.

### Getting Started
After forking or cloning the repository please run these commands being in the root of the project

1. Setup the workspace.
    - Windows: `gradlew setupDecompWorkspace`
    - Linux/Mac OS: `./gradlew setupDecompWorkspace`
    
    This will take a while as several resources will be downloaded from internet and also a Minecraft decompilation process
    will have place.

2. Prepare the IDE of your preference to start working with. The steps listed here are based on IntelliJ or Eclipse and 
are the same explained in the Forge API's official guide.
    - For eclipse, run "gradlew eclipse" (./gradlew eclipse if you are on Mac/Linux)
    - For IntelliJ, steps are a little different.
        - Open IDEA, and import project.
        - Select your `build.gradle` file and have it import.
        - Once it's finished you must close IntelliJ and run the following command: `gradlew genIntellijRuns` 
        (`./gradlew genIntellijRuns` if you are on Mac/Linux)

3. Open your IDE choosing the project you just created.
    Once started you should be ready to start creating a Minecraft Mod. an example base Scala file was prepared for you 
    to start working easily at `main\scala\com\endava\bog\techflow\minecraft\ExampleMod.scala`. 
    
    If for some reason it seems there are missing libraries in your IDE, you can run `gradlew --refresh-dependencies` to refresh the local cache. 
`gradlew clean` to reset everything (this does not affect your code) and then start the process again.

4. Testing the environment.
 - To test run with your mod, `gradlew runClient`. This will launch Minecraft from the <runDir> location, including your mod code. There are various customizations to this command. Consult the ForgeGradle cookbook for more information.
 - To build your mod, run `gradlew build`. This will output a file in `build/libs` with the name  `[archivesBaseName]-[version].jar`. 
 This file can be placed in the mods folder of a forge enabled Minecraft setup, and distributed.
