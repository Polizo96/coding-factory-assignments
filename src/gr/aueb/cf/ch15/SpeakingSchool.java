package gr.aueb.cf.ch15;

import gr.aueb.cf.ch16.Cat;

/**
 * Tightly coupled.
 */
public class SpeakingSchool {
    private Cat cat;

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void learnToSpeak() {
        cat.speak();
    }
}
