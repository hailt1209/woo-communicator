package my.assessment.woocommunicator.domain_models;

import java.util.List;

public interface ProductLoader {
    Product get(int id);
    List<Product> getAll();
}
