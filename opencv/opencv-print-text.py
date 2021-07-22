import cv2, numpy

pic = numpy.zeros((500, 500, 3), dtype='uint8')

font = cv2.FONT_HERSHEY_DUPLEX
cv2.putText(pic, 'Avijit', (100, 100), font, 3, (255, 255, 255), 4, cv2.LINE_8)

cv2.imshow('Name', pic)
cv2.waitKey(0)
cv2.destroyAllWindows()