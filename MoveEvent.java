public class MoveEvent extends Event {
    public int destMapNo;
    public int destX;
    public int destY;

    public MoveEvent(int x, int y, int chipNo, int destMapNo, int destX, int destY) {
        super(x, y, chipNo, false);//chipNo la so thu tu cua su kien di chuyen
        this.destMapNo = destMapNo;
        this.destX = destX;
        this.destY = destY;//  bien destX chipNo destY co the ls map,vi tri tiep theo xuat hien khi qua cua;
    }

    public String toString() {
        return "MOVE:" + super.toString() + ":" + destMapNo + ":" + destX + ":" + destY;
    }
}
