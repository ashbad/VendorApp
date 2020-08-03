package com.ashish.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
