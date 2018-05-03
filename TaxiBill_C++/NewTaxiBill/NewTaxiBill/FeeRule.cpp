#include "FeeRule.h"



FeeRule::FeeRule()
{
}


FeeRule::~FeeRule()
{
}

void FeeRule::init() 
{
}

double FeeRule::getDaytimeInitialRate() {
	return daytimeInitialRate;
}

void FeeRule::setDaytimeInitialRate(double daytimeInitialRate) {
	this->daytimeInitialRate = daytimeInitialRate;
}

double FeeRule::getNightInitialRate() {
	return nightInitialRate;
}

void FeeRule::setNightInitialRate(double nightInitialRate) {
	this->nightInitialRate = nightInitialRate;
}

double FeeRule::getdaytimeMaxDistance() {
	return daytimeMaxDistance;
}

void FeeRule::setDaytimeMaxDistance(double daytimeMaxDistance) {
	this->daytimeMaxDistance = daytimeMaxDistance;
}

double FeeRule::getNightMaxDistance() {
	return nightMaxDistance;
}

void FeeRule::setNightMaxDistance(double nightMaxDistance) {
	this->nightMaxDistance = nightMaxDistance;
}

double FeeRule::getDaytimeUnitePrice() {
	return daytimeUnitePrice;
}

void FeeRule::setDaytimeUnitePrice(double daytimeUnitePrice) {
	this->daytimeUnitePrice = daytimeUnitePrice;
}

double FeeRule::getNightUnitePrice() {
	return nightUnitePrice;
}

void FeeRule::setNightUnitePrice(double nightUnitePrice) {
	this->nightUnitePrice = nightUnitePrice;
}

double FeeRule::getCriticalDistance() {
	return criticalDistance;
}

void FeeRule::setCriticalDistance(double criticalDistance) {
	this->criticalDistance = criticalDistance;
}

double FeeRule::getDaytimeUnitCriticalPrice() {
	return daytimeUnitCriticalPrice;
}

void FeeRule::setDaytimeUnitCriticalPrice(double daytimeUnitCriticalPrice) {
	this->daytimeUnitCriticalPrice = daytimeUnitCriticalPrice;
}

double FeeRule::getNightUnitCriticalPrice() {
	return nightUnitCriticalPrice;
}

void FeeRule::setNightUnitCriticalPrice(double nightUnitCriticalPrice) {
	this->nightUnitCriticalPrice = nightUnitCriticalPrice;
}

int FeeRule::getFeeWaitingMinutesPerYuan() {
	return feeWaitingMinutesPerYuan;
}

void FeeRule::setFeeWaitingMinutesPerYuan(int feeWaitingMinutesPerYuan) {
	this->feeWaitingMinutesPerYuan = feeWaitingMinutesPerYuan;
}