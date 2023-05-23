package day15.com.ict.eduHW;

import java.util.Scanner;

public class Hw03 {
    private static final int MAX_VOLUME = 10;
    private static final int MIN_VOLUME = 0;

    private int[] devices;
    private int currentDeviceIndex;
    private int currentVolume;

    public Hw03() {
        devices = new int[3];
        currentDeviceIndex = -1; // 장치 선택 전에는 -1로 초기화
        currentVolume = 3;
    }

    public void selectDevice(int deviceIndex) {
        if (deviceIndex >= 0 && deviceIndex < devices.length) {
            currentDeviceIndex = deviceIndex;
            System.out.println("장치 #" + currentDeviceIndex + " 선택됨");
        } else {
            System.out.println("유효하지 않은 장치 인덱스입니다.");
        }
    }

    public void adjustVolume(int amount) {
        if (currentDeviceIndex != -1) {
            int newVolume = currentVolume + amount;
            if (newVolume >= MIN_VOLUME && newVolume <= MAX_VOLUME) {
                currentVolume = newVolume;
                devices[currentDeviceIndex] = currentVolume;
                System.out.println("장치 #" + currentDeviceIndex + "의 볼륨을 조절했습니다. 현재 볼륨: " + currentVolume);
            } else {
                System.out.println("볼륨은 최소치 " + MIN_VOLUME + "부터 최대치 " + MAX_VOLUME + "까지 조절 가능합니다.");
            }
        } else {
            System.out.println("장치를 선택해주세요.");
        }
    }

    public void printDeviceVolumes() {
        System.out.println("==== 장치 볼륨 현황 ====");
        for (int i = 0; i < devices.length; i++) {
            System.out.println("장치 #" + i + "의 볼륨: " + devices[i]);
        }
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Hw03 remoteControl = new Hw03();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== 볼륨조절 리모콘 ===");
            System.out.println("1. TV");
            System.out.println("2. 스피커");
            System.out.println("3. 이어폰");
            System.out.println("4. 종료");
            System.out.print("장치를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("종료되었습니다.");
                break;
            }

            remoteControl.selectDevice(choice - 1);

            while (true) {
                System.out.print("볼륨을 조절할 값을 입력하세요: ");
                int amount = scanner.nextInt();
                remoteControl.adjustVolume(amount);

                remoteControl.printDeviceVolumes();

                System.out.print("계속 볼륨을 조절하시겠습니까? (y/n): ");
                String continueChoice = scanner.next();

                if (!continueChoice.equalsIgnoreCase("y")) {
                    System.out.println("종료되었습니다.");
                    break;
                }
            }
        }

        scanner.close();
    }
}