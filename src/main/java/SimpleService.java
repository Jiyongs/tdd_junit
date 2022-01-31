public class SimpleService {

    private SimpleDataRepository simpleDataRepository;

    public void setSimpleDataRepository(SimpleDataRepository simpleDataRepository) {
        this.simpleDataRepository = simpleDataRepository;
    }

    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = simpleDataRepository.findAll();
        for(int value : data) {
            sum += value;
        }
        return sum;
    }

}
