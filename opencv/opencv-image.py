import cv2, numpy

img = cv2.imread('flower.png')

cv2.imshow('Image', img)
cv2.waitKey(0)
cv2.destroyAllWindows()