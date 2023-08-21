#Timer 
from playsound import playsound
import time

#CLEAR = "\033[2J"
#CLEAR_AND_RETURN = "\033[H"

# def clear_console():
#     # Print a sufficient number of empty lines to "clear" the console
#     print("\n" * 10)

def alarm(seconds):
    time_elapsed = 0

    # clear_console()
    #print(CLEAR)
    while time_elapsed < seconds:
        time.sleep(1)
        time_elapsed += 1

        time_left = seconds - time_elapsed
        minutes_left = time_left // 60
        seconds_left = time_left % 60  #remainder of the mod

        #clear_console()
        # print(f"{CLEAR_AND_RETURN}{minutes_left:02d}:{seconds_left:02d}")
        print(f"{minutes_left:02d}:{seconds_left:02d}")

alarm(10)


playsound("alarm.mp3")
