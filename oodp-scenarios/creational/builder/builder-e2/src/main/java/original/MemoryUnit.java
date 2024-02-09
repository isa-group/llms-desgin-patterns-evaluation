package original;

public enum MemoryUnit {
    MB(1), GB(1024), TB(1024 * 1024);    
    private int multiplier;
    MemoryUnit(int multiplier) { this.multiplier = multiplier;  }
    public int getMultiplier() { return multiplier; }    
}