import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    public void fireInPool() {
        BulletPool bulletPool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet bullet = bulletPool.newItem();
            bullet.setPosition(0);
            plist.add(bullet);
            for (int j = 0; j < plist.size(); j++) {
                Bullet bullet2 = plist.get(j);
                bullet2.move();
                System.out.print("-" + bullet2.getPosition());
                if (bullet2.getPosition() == 10){
                    bulletPool.freeItem(bullet2);
                    plist.remove(bullet2);
                }
            }
            System.out.println();
        }
    }
    public void fire(){
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet bullet = new Bullet();
            bullet.setPosition(0);
            plist.add(bullet);
            for (int j = 0; j < plist.size(); j++) {
                Bullet bullet2 = plist.get(j);
                bullet2.move();
                System.out.print("-" + bullet2.getPosition());
                if (bullet2.getPosition() == 10){
                    plist.remove(bullet2);
                }
            }
            System.out.println();
        }
    }
}
