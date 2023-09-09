package model;
public class EmotionScale {
    static int emotionScale;

    public EmotionScale() {
        emotionScale = -1;
    }

    public void setEmotionScale(int emotionScale) {
        EmotionScale.emotionScale = emotionScale;
    }

    public int getEmotionScale() {
        return emotionScale;
    }


}
