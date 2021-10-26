
package javaapplication2;


public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    public TV(){
        
    }
    public void turnOn(){
        on=true;
    }
     public void turnOff(){
        on=false;
    }

    public void setChannel(int newChannel) {
        if(on&newChannel>0&newChannel<=120)
        channel = newChannel ;
    }
     public void set_volumeLevel(int newVolumeLevel) {
         if(on&newVolumeLevel>0&newVolumeLevel<=120)
       volumeLevel=newVolumeLevel;
    }
     public void channelUp(){
         if(channel<120&on)
             channel++;
     }
      public void channelDown(){
         if(channel>1&on)
             channel--;
     }
      public void volumeUp(){
          if(volumeLevel<7&on)
              volumeLevel++;
      }
       public void volumeDown(){
          if(volumeLevel>1&on)
              volumeLevel--;
      }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
       
}
