package co3;

// Interface for Wi-Fi capability
interface WiFiEnabled {
    void connectWiFi();
}

// Interface for voice control
interface VoiceControlled {
    void voiceCommand();
}

// Interface for music playback
interface MusicPlayer {
    void playMusic();
}

// Interface for video streaming
interface VideoStreaming {
    void streamVideo();
}

// Interface for temperature monitoring
interface TemperatureMonitor {
    void monitorTemperature();
}

// Device 1
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Smart Speaker accepting voice commands.");
    }

    public void playMusic() {
        System.out.println("Smart Speaker playing music.");
    }
}

// Device 2
class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart TV connected to Wi-Fi.");
    }

    public void playMusic() {
        System.out.println("Smart TV playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart TV streaming video.");
    }
}

// Device 3
class SmartThermostat implements WiFiEnabled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Smart Thermostat connected to Wi-Fi.");
    }

    public void monitorTemperature() {
        System.out.println("Smart Thermostat monitoring temperature.");
    }
}

// Device 4
class SmartCamera implements WiFiEnabled, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart Camera connected to Wi-Fi.");
    }

    public void streamVideo() {
        System.out.println("Smart Camera streaming video.");
    }
}

// SmartCar implements multiple interfaces
class SmartCar implements
        WiFiEnabled,
        VoiceControlled,
        MusicPlayer,
        VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart Car connected to Wi-Fi.");
    }

    public void voiceCommand() {
        System.out.println("Smart Car accepting voice commands.");
    }

    public void playMusic() {
        System.out.println("Smart Car playing music.");
    }

    public void streamVideo() {
        System.out.println("Smart Car streaming video.");
    }
}

// Main class
public class SmartDeviceControl {

    public static void main(String[] args) {

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        System.out.println();

        SmartTV tv = new SmartTV();
        tv.connectWiFi();
        tv.playMusic();
        tv.streamVideo();

        System.out.println();

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.connectWiFi();
        thermostat.monitorTemperature();

        System.out.println();

        SmartCamera camera = new SmartCamera();
        camera.connectWiFi();
        camera.streamVideo();

        System.out.println();

        SmartCar car = new SmartCar();
        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();
    }
}