package com.Sapient.OMS.Repository;

import com.Sapient.OMS.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {

}
