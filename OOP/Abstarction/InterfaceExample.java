package interfaceexample;

class Phone 
{
    public void call() { System.out.println("Phone call"); }          // basic feature
    public void sms() { System.out.println("Phone sending SMS"); }    // basic feature
}

interface ICamera
{
    void click();   // take photo
    void record();  // record video
}

interface IMusicPlayer
{
    void play();    // play music
    void stop();    // stop music
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); } // extra feature

    public void click() { System.out.println("Smart Phone Clicking Photo"); }    // override
    public void record() { System.out.println("Smart Phone recording video"); }  // override
    public void play() { System.out.println("Smart Phone playing music"); }      // override
    public void stop() { System.out.println("Smart Phone stopped playing music"); } // override
}

public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Phone p = new SmartPhone();          // parent reference
        p.call();
        p.sms();

        ICamera cam = new SmartPhone();      // camera interface reference
        cam.click();
        cam.record();

        IMusicPlayer mp = new SmartPhone();  // music interface reference
        mp.play();
        mp.stop();

        SmartPhone sp = new SmartPhone();    // full access object
        sp.videoCall();
    }
}

Output
Phone call
Phone sending SMS
Smart Phone Clicking Photo
Smart Phone recording video
Smart Phone playing music
Smart Phone stopped playing music
Smart Phone video calling
