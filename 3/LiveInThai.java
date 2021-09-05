public class LiveInThai implements Channel{
    @Override
    public void update(String score) {
        System.out.println("live result: "+score);
    }
}
