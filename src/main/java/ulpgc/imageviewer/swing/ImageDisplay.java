package ulpgc.imageviewer.swing;


import ulpgc.imageviewer.Image;

public interface ImageDisplay {
    void show(Image image);
    Image image();
}