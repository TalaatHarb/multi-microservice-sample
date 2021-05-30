package net.talaatharb.multimicroservice.backend.service.external;

import org.springframework.cloud.openfeign.FeignClient;

import net.talaatharb.multimicroservice.invoicingservice.api.InvoicingServiceApi;

@FeignClient(value = "invoicing-service-api", url = "${invoicing-service-api.url}")
public interface InvoicingExternalService extends InvoicingServiceApi{

}
