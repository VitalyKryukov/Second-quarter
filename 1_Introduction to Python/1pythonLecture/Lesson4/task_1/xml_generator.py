from user_interface import temperature_view
from user_interface import wind_speed_view
from user_interface import pressure_view

def create(device = 1):
    xml = '<xml>\n'
    xml += '    <temperature units = "c">{}</temperature>\n'\
        .format(temperature_view(device))
    xml += '    <wind_speed_view units = "m/s">{}</wind_speed_view>\n'\
        .format(wind_speed_view(device))
    xml += '    <pressure units = "mmHg">{}</pressure>\n'\
        .format(pressure_view(device))
    
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson4/task_1/data.xml', 'w') as page:
        page.write(xml)

    return xml
    
def new_create(data, device = 1):
    t, p , w = data
    t = t * 1.8 + 32
    xml = '<xml>\n'
    xml += '    <temperature units = "f">{}</temperature>\n'\
        .format(t)
    xml += '    <wind_speed_view units = "m/s">{}</wind_speed_view>\n'\
        .format(w)
    xml += '    <pressure units = "mmHg">{}</pressure>\n'\
        .format(p)
    
    with open('G:/GeekBrains/1_Учебный процесс/2 четверть/Second quarter/1_Introduction to Python/1pythonLecture/Lesson4/task_1/new_data.xml', 'w') as page:
        page.write(xml)

    return data