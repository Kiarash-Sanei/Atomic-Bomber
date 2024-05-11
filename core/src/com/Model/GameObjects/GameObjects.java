package com.Model.GameObjects;

public enum GameObjects {
    Bonus(40, (float) (40 * 535) / 548),
    Building(150, (float) (150 * 849) / 2187),
    ClusterBomb(20, (float) (20 * 1979) / 5524),
    Mig(40, (float) (40 * 1225) / 275),
    Plane(40, (float) (40 * 1236) / 350),
    RadioactiveBomb(20, (float) (20 * 694) / 1952),
    RegularBomb(20, (float) (20 * 958) / 3148),
    Tank(70, (float) (70 * 1263) / 634),
    Tree(70, (float) (70 * 573) / 640),
    Trench(30, (float) (30 * 1484) / 674),
    Truck(50, (float) (50 * 983) / 352);
    private final float height;
    private final float width;

    GameObjects(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }
    public static float getHeight(GameObject gameObject) {
        if (gameObject.getClass().equals(com.Model.GameObjects.Bonus.class)) {
            return Bonus.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Building.class)) {
            return Building.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.ClusterBomb.class)) {
            return ClusterBomb.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Mig.class)) {
            return Mig.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Plane.class)) {
            return Plane.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.RadioactiveBomb.class)) {
            return RadioactiveBomb.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.RegularBomb.class)) {
            return RegularBomb.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Tank.class)) {
            return Tank.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Tree.class)) {
            return Tree.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Trench.class)) {
            return Trench.getHeight();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Truck.class)) {
            return Truck.getHeight();
        }
        return 0;
    }
    public static float getWidth(GameObject gameObject) {
        if (gameObject.getClass().equals(com.Model.GameObjects.Bonus.class)) {
            return Bonus.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Building.class)) {
            return Building.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.ClusterBomb.class)) {
            return ClusterBomb.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Mig.class)) {
            return Mig.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Plane.class)) {
            return Plane.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.RadioactiveBomb.class)) {
            return RadioactiveBomb.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.RegularBomb.class)) {
            return RegularBomb.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Tank.class)) {
            return Tank.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Tree.class)) {
            return Tree.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Trench.class)) {
            return Trench.getWidth();
        } else if (gameObject.getClass().equals(com.Model.GameObjects.Truck.class)) {
            return Truck.getWidth();
        }
        return 0;
    }
}
