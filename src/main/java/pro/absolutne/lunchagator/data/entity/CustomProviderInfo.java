package pro.absolutne.lunchagator.data.entity;

import lombok.Data;
import pro.absolutne.lunchagator.lunch.MenuProvider;
import pro.absolutne.lunchagator.lunch.provider.CustomMenuProvider;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("class")
@Data
public class CustomProviderInfo extends MenuProviderInfo {

    private String strategyId;

    @Override
    public Class<? extends MenuProvider> getMenuProviderImpl() {
        return CustomMenuProvider.class;
    }
}
