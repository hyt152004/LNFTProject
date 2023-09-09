package model;

import exception.emotionScaleOutOfBoundsException;

public class EmotionScale {

    private static int emotionScale;

    // EFFECTS: constructs a new EmotionScale 
    public EmotionScale() {
        emotionScale = -1;
    }

    // MODIFIES: this
    // EFFECTS: sets the emotionScale to the given value.
    //          if given value is not within in [0, 5], then throw new emotionScaleOutOfBoundsException
    public void setEmotionScale(int emotionScale) throws emotionScaleOutOfBoundsException {
        if (emotionScale >= 0 && emotionScale <= 5) {
            EmotionScale.emotionScale = emotionScale;
        }

        else {
            throw new emotionScaleOutOfBoundsException();
        }
    }

    // EFFECTS: returns emotionScale
    public int getEmotionScale() {
        return emotionScale;
    }


}
