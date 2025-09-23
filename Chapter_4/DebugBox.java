class DebugBox
{
    private int width;
    private int length;
    private int height;

    public DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;  
        this.height = height; 
    }

    public void showData()
    {
        System.out.println("Width: " + width + " \nLength: " + length + "\nHeight: " + height);
    }

    public double getVolume()  
    {
        double vol = length * width * height;
        return vol;
    }

    public static void main(String[] args)
    {
        DebugBox box = new DebugBox(4, 6, 4);
        System.out.println("\nBox:");
        box.showData();
        System.out.println("Volume: " + box.getVolume());

        }
}

