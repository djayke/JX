package JXW.Event;

public interface DocumentEvent {
    void load(String bind);
    void unload(String bind);
    void resize(String bind);
    void reset(String bind);
    void submit(String bind);
    void scroll(String bind);
    void timeupdate(String bind);
}
