package com.zbq.facade;

/**
 * Facade
 * 外观角色角色
 */
public class Computer {

    //统一管理内部子系统
    private CPU cpu = new CPU();
    private HardDrive hardDrive = new HardDrive();
    private Memory memory = new Memory();

    long BOOT_ADDRESS;
    long BOOT_SECTOR;
    int SECTOR_SIZE;

    public void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}