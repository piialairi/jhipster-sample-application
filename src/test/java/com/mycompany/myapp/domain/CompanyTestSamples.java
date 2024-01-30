package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class CompanyTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static Company getCompanySample1() {
        return new Company()
            .id(1L)
            .name("name1")
            .streetAddress("streetAddress1")
            .postalCode("postalCode1")
            .city("city1")
            .email("email1")
            .phoneNumber("phoneNumber1");
    }

    public static Company getCompanySample2() {
        return new Company()
            .id(2L)
            .name("name2")
            .streetAddress("streetAddress2")
            .postalCode("postalCode2")
            .city("city2")
            .email("email2")
            .phoneNumber("phoneNumber2");
    }

    public static Company getCompanyRandomSampleGenerator() {
        return new Company()
            .id(longCount.incrementAndGet())
            .name(UUID.randomUUID().toString())
            .streetAddress(UUID.randomUUID().toString())
            .postalCode(UUID.randomUUID().toString())
            .city(UUID.randomUUID().toString())
            .email(UUID.randomUUID().toString())
            .phoneNumber(UUID.randomUUID().toString());
    }
}
