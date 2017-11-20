package fr.isen.map;

import fr.isen.map.element.MapElement;
import fr.isen.map.element.MapElementFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RPGMapBuilder {
    private int width;
    private int height;
    private MapElementFactory factory;
    private boolean[][] mask;
    public RPGMapBuilder setSize(int w, int h) {
        width = w;
        height = h;
        return this;
    }
    public RPGMapBuilder setFactory(MapElementFactory f) {
        factory = f;
        return this;
    }
    public RPGMap build() {
        generateRandomMask();
        List<List<MapElement>> tileArray = generateMapArrayFromMask();
        return new RPGMap(tileArray);
    }
    protected List<List<MapElement>> generateMapArrayFromMask() {
        List<List<MapElement>> tileArray = initMapArray();
        for(int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                MapElement element = null;
                if(mask[x][y]) {
                    element = factory.getWall();
                } else {
                    element = factory.getGround();
                }
                tileArray.get(x).add(y, element);
            }
        }
        return tileArray;
    }
    protected List<List<MapElement>> initMapArray() {
        List<List<MapElement>> tileArray = new ArrayList<List<MapElement>>(width);
        for(int x = 0; x < width; ++x) {
            tileArray.add(new ArrayList<MapElement>(height));
        }
        return tileArray;
    }
    protected void generateRandomMask() {
        createEmptyMask();
        generateBorderWalls();
        generateRandomObstacles();
    }
    protected void createEmptyMask() {
        mask = new boolean[width][height];
        for(int x = 0; x < width; ++x) {
            for(int y = 0; y < height; ++y) {
                mask[x][y] = false;
            }
        }
    }
    protected void generateBorderWalls() {
        for(int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                if(0 == x || width-1 == x || 0 == y || height-1 == y) {
                    mask[x][y] = true;
                }
            }
        }
    }
    protected void generateRandomObstacles() {
        Random generator = new Random();
        int numberOfWalls = (int)(width*height*0.1);
        for(int i = 0; i < numberOfWalls; ++i) {
            int x = generator.nextInt(width-2)+1;
            int y = generator.nextInt(height-2)+1;
            mask[x][y] = true;
        }
    }
}
