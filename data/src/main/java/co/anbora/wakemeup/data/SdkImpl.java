package co.anbora.wakemeup.data;

import android.content.Context;
import android.support.annotation.NonNull;

import co.anbora.wakemeup.domain.model.AlarmGeofence;
import co.anbora.wakemeup.domain.model.HistoryAlarm;
import co.anbora.wakemeup.domain.repository.AlarmGeofenceRepository;
import co.anbora.wakemeup.domain.repository.HistoryAlarmRepository;
import co.anbora.wakemeup.domain.repository.Repository;

public class SdkImpl implements Repository {

    private Repository repository;

    protected SdkImpl(@NonNull Context context){
        this.repository = Injection.provideRepository(context);
    }

    @Override
    public void getAlarm(String alarmId, GetAlarmCallback callback) {
        this.repository.getAlarm(alarmId, callback);
    }

    @Override
    public void getAlarms(LoadAlarmsCallback callback) {
        this.repository.getAlarms(callback);
    }

    @Override
    public void saveAlarm(AlarmGeofence alarm) {
        this.repository.saveAlarm(alarm);
    }

    @Override
    public void deleteAlarm(AlarmGeofence alarm) {
        this.repository.deleteAlarm(alarm);
    }

    @Override
    public void updateAlarm(AlarmGeofence alarm, Boolean state) {
        this.repository.updateAlarm(alarm, state);
    }

    @Override
    public void getHistoryAlarms(LoadHistoryAlarmsCallback callback) {
        this.repository.getHistoryAlarms(callback);
    }

    @Override
    public void getHistoryLastPointsAlarms(LoadLastPointAlarmsCallback callback) {
        this.repository.getHistoryLastPointsAlarms(callback);
    }

    @Override
    public void getHistoryAlarm(String alarmId, GetHistoryAlarmCallback callback) {
        this.repository.getHistoryAlarm(alarmId, callback);
    }

    @Override
    public void saveHistoryAlarm(HistoryAlarm historyAlarm) {
        this.repository.saveHistoryAlarm(historyAlarm);
    }
}
