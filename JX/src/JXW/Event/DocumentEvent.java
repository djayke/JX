package JXW.Event;

public interface DocumentEvent {
    void load();
    void unload();
    void resize();
    void reset();
    void submit();
    void scroll();
    void timeupdate();
}
