public abstract class Event {
    protected int x;
    protected int y;
    protected int id;
    protected boolean isHit;

    public Event(int x, int y, int id, boolean isHit) {
        this.x = x;
        this.y = y;
        this.id = id;// bien Id dung de chon hinh anh tu mapchip.gif
        this.isHit = isHit;// bien isHit de kiem tra xem nhan vat co di qua duoc hay khong
    }

    public String toString() {
        return x + ":" + y + ":" + id + ":" + isHit;
    }
}
