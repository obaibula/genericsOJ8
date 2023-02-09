package mixins.MYDEC;

import java.util.Date;

class Basic {
    private String val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}

class Decorator extends Basic{
    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    @Override
    public String getVal() {
        return basic.getVal();
    }

    @Override
    public void setVal(String val) {
        basic.setVal(val);
    }
}

class TimeStampre extends Decorator{
    private final long timeStamp;

    public TimeStampre(Basic basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

class SerialNumber extends Decorator{
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumber(Basic basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}

public class MyDecoration {
    public static void main(String[] args) {
        TimeStampre t1 = new TimeStampre(new Basic());
        System.out.println(t1.getVal());
        TimeStampre t2 = new TimeStampre(new SerialNumber(new Basic()));
        System.out.println(t2.getTimeStamp());
        SerialNumber s = new SerialNumber(new TimeStampre(new Basic()));

        System.out.println(s.getSerialNumber());
    }
}
