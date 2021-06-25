package zombiegame.app.character;

import zombiegame.app.weapon.*;

/**
 * Implemented by {@code Character} classes that can use weapons.
 */
public interface Equippable {
    
    /**
     * Contains all {@code Weapon} classes that can be equipped.
     */
    public static final Weapon[] WEAPON_CACHE = {new AssaultRifle(), new Axe(), 
            new Crowbar(), new FryingPan(), new Pistol(), new Shotgun(), 
            new SubmachineGun()};
    
    /**
     * Equips a {@code Weapon} to a {@code Character}.
     */
    public abstract void equip();
    
    /**
     * Gets the currently equipped {@code Weapon}.
     * 
     * @return currently equipped {@code Weapon}
     */
    public abstract Weapon getWeapon();
    
}
