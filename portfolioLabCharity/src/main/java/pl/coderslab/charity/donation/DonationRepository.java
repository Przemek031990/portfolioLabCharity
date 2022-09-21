package pl.coderslab.charity.donation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DonationRepository extends CrudRepository<Donation, Long> {
    List<Donation> findAllById();
}
