# OSecurity

OSecurity is a simple home alarm system, run on a Raspberry Pi terminal and remotely controlled by an Android application.

Raspberry Pi repo: https://github.com/sflovik/OSecurity


## OSecurity requires:
- Python
- Android Studio
- Raspberry Pi run on Raspbian, with connected hardware (sensor kit, camera-module)
- Packages on Raspbian: LSB 3.0 (or above), Hamachi, GPIO, Xdotool

## OSeucurity recommendation:
- Intel Haxm if the Android Studio application emulator is run on an Intel CPU

## Startup guide:
- Connect the necessary hardware modules for your version of OSecurity
- Power up the Raspberry Pi
- Run the application through the Android Studio emulator or through your Android device (apk will be needed)
- The system is now ready for use

## New: Facial recognition
We have now implemented facial recognition into the system, and with this, you can increase your security and be able to identify your potential intruders. 

Here is our promotional video that we created to convey the message of our product:
[Video] (https://youtu.be/Yz2-tdtG8Is)

With this new feature, we are now able to capture snapshots of the intruder when the sensors detect motion, as well as recognizing facial features. This was done by implementing features from the OpenCV library (http://opencv.org/). 

The snapshots that are taken are saved and sent to your registered e-mail adress so you can forward it to the appropriate authorities or your insurance company. 

New scripts involved in this expansion:

* haarcascade_frontalface_default.xml
* liveRecognition.py
* camera.py
* terminalscripts.py (Refactored)
* sendMail.py (Refactored)
* server.py (Refactored)

## New: Live streaming video
We have now implemented live streaming of video into the Android application, and you can now monitor your home in real time. This is done by leveraging Amazon Web Services as a provider and delivering the stream through Wowza streaming engine. 

It's displayed in an Android VideoView element which displays the stream when you press the button that says "Start stream". 


## License

This project is licensed under the GNU GPL 3.0, see [License](license.md) for more information.
      
