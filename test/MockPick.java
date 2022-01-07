import java.util.List;

import dungeon.GameModel;

/**
 * Mock model created for testing the pick operations of the controller.
 */
public class MockPick implements GameModel {
  @Override
  public void createPlayer() {
    //not used in this mock implementation
  }

  @Override
  public void addPlayerInDungeon() {
    //not used in this mock implementation
  }

  @Override
  public boolean isPlayerDead() {
    return false;
  }

  @Override
  public boolean isGameOver() {
    return false;
  }

  @Override
  public String getNextPossibleMoves() {
    return "N E S W";
  }

  @Override
  public String getPlayerDescription() {
    return "Diamonds- 1, Sapphires- 2, Rubies- 2, Arrows- 5";
  }

  @Override
  public int getRubyCount() {
    return 1;
  }

  @Override
  public int getDiamondCount() {
    return 2;
  }

  @Override
  public int getSapphireCount() {
    return 2;
  }

  @Override
  public int getArrowCount() {
    return 2;
  }

  @Override
  public String getLocationSmell() {
    return "";
  }

  @Override
  public String getAvailableItems() {
    String s = "";

    if (getRubyCount() > 0) {
      s += getRubyCount() + " rubies, ";
    }
    if (getDiamondCount() > 0) {
      s += getDiamondCount() + " diamonds, ";
    }
    if (getSapphireCount() > 0) {
      s += getSapphireCount() + " sapphires, ";
    }
    if (getArrowCount() > 0) {
      s += getArrowCount() + " arrows ";
    }
    return s;
  }

  @Override
  public boolean movePlayerTo(String direction) {
    return true;
  }

  @Override
  public void pickItemAtLocation(String item, int count) {
    if ((item.equalsIgnoreCase("R") && count <= getRubyCount())
            || (item.equalsIgnoreCase("D") && count <= getDiamondCount())
            || (item.equalsIgnoreCase("S") && count <= getSapphireCount())
            || (item.equalsIgnoreCase("A") && count <= getArrowCount())) {
      //not used in this mock implementation
    } else {
      throw new IllegalArgumentException("Invalid choice of item.");
    }
  }

  @Override
  public int shootArrow(String direction, int distance) {
    return 0;
  }

  @Override
  public String getStartLocation() {
    return "";
  }

  @Override
  public String getEndLocation() {
    return "";
  }

  @Override
  public List<String> getEdges() {
    return null;
  }

  @Override
  public String getPlayerLocation() {
    return null;
  }

  @Override
  public String getLocationType(String loc) {
    return "Cave";
  }

  @Override
  public List<String> getOtyughLocations() {
    return null;
  }
}
