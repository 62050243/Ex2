public class OppaFootball implements Channel{
    @Override
    public void update(String score) {
        System.out.println("live result: "+score);
    }
}
